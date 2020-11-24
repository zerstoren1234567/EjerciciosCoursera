package com.curso.coursera.restApi.deserializador;

import com.curso.coursera.model.Perro;
import com.curso.coursera.restApi.JsonKeys;
import com.curso.coursera.restApi.model.PerroResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class PerroDeserializador implements JsonDeserializer<PerroResponse> {
    @Override
    public PerroResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        PerroResponse perroResponse = gson.fromJson(json, PerroResponse.class);
        JsonArray jsonArray = json.getAsJsonObject().getAsJsonArray(JsonKeys.MEDIA_RESPONSE_ARRAY);

        perroResponse.setPerros(deserializadorPerroDeJson(jsonArray));
        return perroResponse;
    }

    private ArrayList<Perro> deserializadorPerroDeJson(JsonArray perroResponseData){
        ArrayList<Perro> perros = new ArrayList<>();
        for (int i = 0; i < perroResponseData.size(); i++){
            JsonObject perroResponseDataObject = perroResponseData.get(i).getAsJsonObject();

            JsonObject userJson = perroResponseDataObject.getAsJsonObject(JsonKeys.USER);
            String id = userJson.get(JsonKeys.USER_ID).getAsString();
            String nombreCompleto = userJson.get(JsonKeys.USER_FULL_NAME).getAsString();

            JsonObject imageJson = perroResponseDataObject.getAsJsonObject(JsonKeys.MEDIA_IMAGES);
            JsonObject stdResolutionJson = perroResponseDataObject.getAsJsonObject(JsonKeys.MEDIA_STANDARD_RESOLUTION);
            String urlFoto = stdResolutionJson.get(JsonKeys.MEDIA_URL).getAsString();

            JsonObject ratingJson = perroResponseDataObject.getAsJsonObject(JsonKeys.MEDIA_RATING);
            int rating = ratingJson.get(JsonKeys.MEDIA_RATING_COUNT).getAsInt();

            Perro perro = new Perro();
            perro.setId(Integer.parseInt(id));
            perro.setNombre(nombreCompleto);
            perro.setUrlFoto(urlFoto);
            perro.setRank(String.valueOf(rating));

            perros.add(perro);

        }
        return perros;
    }
}
