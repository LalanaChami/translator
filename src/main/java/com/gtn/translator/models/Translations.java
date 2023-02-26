package com.gtn.translator.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "translations")
public class Translations {
    private ObjectId id;
    private String key;
    private Integer languageId;
    private Date lastUpdated;
    private String localization;
}
