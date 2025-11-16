package com.sy.side;

import com.sy.side.common.config.EnableCommonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCommonConfig
public class CmsWorkspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsWorkspaceApplication.class, args);
    }

}
