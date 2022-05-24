package com.adobe.aem.guides.wknd.core.models.trainingfiec.model;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardsContainer {

    static final String RESOURCE_TYPE = "wknd/components/cards";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String titleSize;

    @Inject
    @Via("resource")
    private List<Resource> items;

    public String getTitle() {
        return title;
    }

    public String getTitleSize() {
        return titleSize;
    }

    public List<Resource> getItems() {
        return items;
    }

    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
