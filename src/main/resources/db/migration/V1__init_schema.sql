-- V1__init_schema.sql
-- Initial schema for LinkForge application

CREATE TABLE IF NOT EXISTS links (
    id          BIGSERIAL PRIMARY KEY,
    short_code  VARCHAR(20)  NOT NULL UNIQUE,
    original_url TEXT        NOT NULL,
    title       VARCHAR(255),
    description TEXT,
    click_count BIGINT       NOT NULL DEFAULT 0,
    is_active   BOOLEAN      NOT NULL DEFAULT TRUE,
    created_at  TIMESTAMP    NOT NULL DEFAULT NOW(),
    updated_at  TIMESTAMP    NOT NULL DEFAULT NOW(),
    expires_at  TIMESTAMP
);

CREATE INDEX IF NOT EXISTS idx_links_short_code ON links (short_code);
CREATE INDEX IF NOT EXISTS idx_links_created_at ON links (created_at DESC);
