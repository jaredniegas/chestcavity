package net.tigereye.chestcavity.chestcavities.types.generated.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.SinglePreparationResourceReloadListener;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.tigereye.chestcavity.ChestCavity;
import net.tigereye.chestcavity.chestcavities.types.generated.GeneratedChestCavityType;
import net.tigereye.chestcavity.chestcavities.types.generated.json.ChestCavityTypeJsonFormat;
import net.tigereye.chestcavity.chestcavities.types.generated.json.ChestCavityTypeSerializer;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedChestCavityTypeManager implements SimpleSynchronousResourceReloadListener {
    private static final String RESOURCE_LOCATION = "types";
    private final ChestCavityTypeSerializer SERIALIZER = new ChestCavityTypeSerializer();
    public static Map<Identifier, GeneratedChestCavityType> GeneratedChestCavityTypes = new HashMap<>();

    @Override
    public Identifier getFabricId() {
        return new Identifier(ChestCavity.MODID, RESOURCE_LOCATION);
    }

    @Override
    public void apply(ResourceManager manager) {
        GeneratedChestCavityTypes.clear();
        ChestCavity.LOGGER.info("Loading Chest Cavity Types");
        for(Identifier id : manager.findResources(RESOURCE_LOCATION, path -> path.endsWith(".json"))) {
            try(InputStream stream = manager.getResource(id).getInputStream()) {
                Reader reader = new InputStreamReader(stream);
                GeneratedChestCavityTypes.put(id,SERIALIZER.read(id,new Gson().fromJson(reader,ChestCavityTypeJsonFormat.class)));
            } catch(Exception e) {
                ChestCavity.LOGGER.error("Error occurred while loading resource json " + id.toString(), e);
            }
        }
    }
}
