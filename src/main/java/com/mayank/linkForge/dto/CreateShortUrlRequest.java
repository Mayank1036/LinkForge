package com.mayank.linkForge.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.Instant;
public class CreateShortUrlRequest {
    @NotBlank(message = "Original URL is required")
    @Pattern(
            regexp = "^https?://.+",
            message = "Original URL must start with http:// or https://"
    )
    private String originalUrl;

    private String customAlias;

    private Instant expiresAt;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getCustomAlias() {
        return customAlias;
    }

    public void setCustomAlias(String customAlias) {
        this.customAlias = customAlias;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Instant expiresAt) {
        this.expiresAt = expiresAt;
    }
}
