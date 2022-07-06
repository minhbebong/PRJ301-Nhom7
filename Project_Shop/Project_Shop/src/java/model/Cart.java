/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.Product;


@Builder
@Getter
@Setter
@ToString
public class Cart {

    private Product product;
    private int quantity; // số lượng sản phẩm trên giỏ hàng
}