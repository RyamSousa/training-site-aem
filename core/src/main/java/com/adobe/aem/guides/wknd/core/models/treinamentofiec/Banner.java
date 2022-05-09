package com.adobe.aem.guides.wknd.core.models.treinamentofiec;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Named;

@Model(
    adaptables = Resource.class,
    resourceType = Banner.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Banner {

    static final String RESOURCE_TYPE = "wknd/components/banner";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String titleSize;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String imageBanner;

    public String getTitle() {
        return title;
    }

    public String getTitleSize() {
        return titleSize;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return imageBanner;
    }
}
