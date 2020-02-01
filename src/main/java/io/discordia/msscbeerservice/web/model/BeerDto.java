package io.discordia.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @Null
    private Integer version;


    @Null
    @JsonFormat(pattern="yyy-MM-dd'T'HH:mm:ss2", shape= Shape.STRING)
    private OffsetDateTime createdDate;
    
    @Null
    @JsonFormat(pattern="yyy-MM-dd'T'HH:mm:ss2", shape= Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyle beerStyle;
    @Positive
    @NotNull
    private Long upc;

    @JsonFormat(shape= Shape.STRING)
    @NotNull
    @Positive
    private BigDecimal price;

    private Integer quantityOnHand;


}
