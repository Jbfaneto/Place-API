package br.com.apilugares.placeservice.web;

import br.com.apilugares.placeservice.api.PlaceResponse;
import br.com.apilugares.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse toResponse(Place place) {
        return new PlaceResponse(
                place.name(),
                place.slug(),
                place.state(),
                place.createdAt(),
                place.updatedAt()
        );
    }
}
