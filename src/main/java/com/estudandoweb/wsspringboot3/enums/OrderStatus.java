package com.estudandoweb.wsspringboot3.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    // construtor no enum é private
    private OrderStatus(int code){
        this.code = code;
    }

    // método publico para acessar
    public int getCode(){
        return code;
    }

    // conversão do número em orderStatus
    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
