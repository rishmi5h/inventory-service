package com.rishmi5h.inventory.controller;

import com.rishmi5h.inventory.dto.InventoryResponse;
import com.rishmi5h.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> getInventory(@RequestParam List<String> skuCodes){
        return inventoryService.getInventory(skuCodes);
    }

}
