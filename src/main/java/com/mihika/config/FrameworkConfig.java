package com.mihika.config;

import com.mihika.config.converter.StringtoBrowserTypeConverter;
import com.mihika.config.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})

public interface FrameworkConfig extends Config {

@DefaultValue("CHROME")
@ConverterClass(StringtoBrowserTypeConverter.class)
BrowserType browser();


}
