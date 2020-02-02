package com.example.hurbalpha.webservice.model

import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("filters")
    val filters: Filters,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("pagination")
    val pagination: Pagination
) {
    data class Meta(
        @SerializedName("count")
        val count: Int,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("query")
        val query: String,
        @SerializedName("warning")
        val warning: String,
        @SerializedName("countWithAvailabilityInPage")
        val countWithAvailabilityInPage: Int,
        @SerializedName("countHotel")
        val countHotel: Int,
        @SerializedName("countPackage")
        val countPackage: Int,
        @SerializedName("countTicket")
        val countTicket: Int,
        @SerializedName("countBustrip")
        val countBustrip: Int,
        @SerializedName("countDisney")
        val countDisney: Int
    )

    data class Filters(
        @SerializedName("amenities")
        val amenities: List<Amenity>,
        @SerializedName("attributes")
        val attributes: List<Attribute>,
        @SerializedName("countries")
        val countries: List<Country>,
        @SerializedName("cities")
        val cities: List<City>,
        @SerializedName("departureCities")
        val departureCities: List<DepartureCity>,
        @SerializedName("duration")
        val duration: List<Duration>,
        @SerializedName("food")
        val food: List<Food>,
        @SerializedName("people")
        val people: List<People>,
        @SerializedName("prices")
        val prices: List<Price>,
        @SerializedName("priceInterval")
        val priceInterval: PriceInterval,
        @SerializedName("productType")
        val productType: List<ProductType>,
        @SerializedName("regulation")
        val regulation: List<Regulation>,
        @SerializedName("rooms")
        val rooms: List<Room>,
        @SerializedName("stars")
        val stars: List<Star>,
        @SerializedName("states")
        val states: List<State>
    ) {
        data class Amenity(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Attribute(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Country(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class City(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class DepartureCity(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Duration(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Food(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class People(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Price(
            @SerializedName("min")
            val min: Int,
            @SerializedName("maxExclusive")
            val maxExclusive: Int,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class PriceInterval(
            @SerializedName("min")
            val min: Int,
            @SerializedName("max")
            val max: Int,
            @SerializedName("filterPattern")
            val filterPattern: String
        )

        data class ProductType(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Regulation(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Room(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class Star(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )

        data class State(
            @SerializedName("term")
            val term: String,
            @SerializedName("filter")
            val filter: String,
            @SerializedName("count")
            val count: Int
        )
    }

    data class Result(
        @SerializedName("sku")
        val sku: String,
        @SerializedName("isHotel")
        val isHotel: Boolean,
        @SerializedName("category")
        val category: String,
        @SerializedName("smallDescription")
        val smallDescription: String,
        @SerializedName("amenities")
        val amenities: List<Amenity>,
        @SerializedName("id")
        val id: String,
        @SerializedName("price")
        val price: Price,
        @SerializedName("hu_free_cancellation")
        val huFreeCancellation: Boolean,
        @SerializedName("image")
        val image: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("url")
        val url: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("stars")
        val stars: Int,
        @SerializedName("gallery")
        val gallery: List<Gallery>,
        @SerializedName("address")
        val address: Address,
        @SerializedName("tags")
        val tags: List<Any>,
        @SerializedName("quantityDescriptors")
        val quantityDescriptors: QuantityDescriptors,
        @SerializedName("featuredItem")
        val featuredItem: FeaturedItem
    ) {
        data class Amenity(
            @SerializedName("name")
            val name: String,
            @SerializedName("category")
            val category: String
        )

        data class Price(
            @SerializedName("amount")
            val amount: Double,
            @Deprecated("Field deprecated")
            @SerializedName("old_price")
            val oldPrice: Double,
            @SerializedName("currency")
            val currency: String,
            @SerializedName("currency_original")
            val currencyOriginal: String,
            @SerializedName("gain")
            val gain: Int,
            @SerializedName("fee_extra_original")
            val feeExtraOriginal: Int,
            @SerializedName("gain_original")
            val gainOriginal: Int,
            @SerializedName("tariff_policies")
            val tariffPolicies: List<Any>,
            @Deprecated("Field deprecated")
            @SerializedName("current_price")
            val currentPrice: Double,
            @SerializedName("total_price")
            val totalPrice: Double,
            @SerializedName("fee_extra")
            val feeExtra: Int,
            @SerializedName("sku")
            val sku: String,
            @SerializedName("taxes")
            val taxes: List<Tax>,
            @SerializedName("originalAmountPerDay")
            val originalAmountPerDay: Double,
            @SerializedName("amountPerDay")
            val amountPerDay: Double
        ) {
            data class Tax(
                @SerializedName("type")
                val type: String,
                @SerializedName("name")
                val name: String,
                @SerializedName("amount")
                val amount: Double,
                @SerializedName("amount_original")
                val amountOriginal: Double,
                @SerializedName("currency")
                val currency: String,
                @SerializedName("currency_original")
                val currencyOriginal: String
            )
        }

        data class Gallery(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String
        )

        data class Address(
            @SerializedName("zipcode")
            val zipcode: String,
            @SerializedName("street")
            val street: String,
            @SerializedName("street_name")
            val street_name: String,
            @SerializedName("streetName")
            val streetName: String,
            @SerializedName("address")
            val address: String,
            @SerializedName("fullAddress")
            val fullAddress: String,
            @SerializedName("full_address")
            val full_address: String,
            @SerializedName("neighborhood")
            val neighborhood: String,
            @SerializedName("id_atlas_neighborhood")
            val idAtlasNeighborhood: Any?,
            @SerializedName("id_neighborhood")
            val idNeighborhood: Any?,
            @SerializedName("city")
            val city: String,
            @SerializedName("id_atlas_city")
            val idAtlasCity: Any?,
            @SerializedName("id_city")
            val idCity: Int,
            @SerializedName("state")
            val state: String,
            @SerializedName("id_atlas_state")
            val idAtlasState: Any?,
            @SerializedName("id_state")
            val idState: Int,
            @SerializedName("country")
            val country: String,
            @SerializedName("id_atlas_country")
            val idAtlasCountry: Any?,
            @SerializedName("id_country")
            val idCountry: Int,
            @SerializedName("countryAlfa2")
            val countryAlfa2: String,
            @SerializedName("country_alfa2")
            val country_alfa2: String,
            @SerializedName("geoLocation")
            val geoLocation: GeoLocation
        ) {
            data class GeoLocation(
                @SerializedName("lat")
                val lat: Double,
                @SerializedName("lon")
                val lon: Double
            )
        }

        data class QuantityDescriptors(
            @SerializedName("maxChildren")
            val maxChildren: Int,
            @SerializedName("maxAdults")
            val maxAdults: Int,
            @SerializedName("maxFreeChildrenAge")
            val maxFreeChildrenAge: Int
        )

        data class FeaturedItem(
            @SerializedName("amenities")
            val amenities: List<String>,
            @SerializedName("name")
            val name: String,
            @SerializedName("image")
            val image: String,
            @SerializedName("description")
            val description: String
        )
    }

    data class Pagination(
        @SerializedName("count")
        val count: Int,
        @SerializedName("firstPage")
        val firstPage: String,
        @SerializedName("nextPage")
        val nextPage: String,
        @SerializedName("previousPage")
        val previousPage: String,
        @SerializedName("lastPage")
        val lastPage: String
    )
}