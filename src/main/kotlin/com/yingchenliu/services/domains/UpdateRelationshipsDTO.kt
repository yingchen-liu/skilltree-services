package com.yingchenliu.services.domains

enum class NodeOrderPosition {
    BEFORE,
    AFTER,
}

data class NodeOrderDTO(val position: NodeOrderPosition, val relatedToUUID: String)

data class NodePositionDTO(val parentUUID: String, val order: NodeOrderDTO?)