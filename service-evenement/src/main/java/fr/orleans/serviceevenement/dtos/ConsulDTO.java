package fr.orleans.serviceevenement.dtos;


public record ConsulDTO(String LockIndex, String Key, Integer Flags, String Value, Integer CreateIndex, Integer ModifyIndex) {
}
