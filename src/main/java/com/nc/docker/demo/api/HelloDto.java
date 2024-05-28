package com.nc.docker.demo.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloDto {
    private String message;
    private String uuid;
}
