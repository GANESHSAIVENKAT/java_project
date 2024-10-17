package com.xworkz.product.runner;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepoImplimentation;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImplimentation;

import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {
        ProductService service = new ProductServiceImplimentation(new ProductRepoImplimentation());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Save Product");
            System.out.println("2. Read All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
           

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create (Save) operation
                    ProductDto dto = new ProductDto();
                    System.out.println("Enter Product Name:");
                    dto.setProductName(scanner.next());
                    System.out.println("Enter Product Brand:");
                    dto.setProductBrand(scanner.next());
                    System.out.println("Enter Product ID:");
                    dto.setProductId(scanner.nextInt());
                    System.out.println("Enter Product Price:");
                    dto.setProductPrice(scanner.nextInt());
                    System.out.println("Enter Product Weight:");
                    dto.setProductWeight(scanner.nextDouble());
                    System.out.println("Enter Product Color:");
                    dto.setProductColor(scanner.next());

                    String result = service.validate(dto);
                    System.out.println(result);
                    break;

                case 2:
                    // Read operation
                    System.out.println("List of All Products:");
                    System.out.println(service.getAll());
                    break;

                case 3:
                    // Update operation
                    System.out.println("Enter the Product ID to update:");
                    int idToUpdate = scanner.nextInt();
                    ProductDto newDto = new ProductDto();

                    System.out.println("Enter New Product Name:");
                    newDto.setProductName(scanner.next());
                    System.out.println("Enter New Product Brand:");
                    newDto.setProductBrand(scanner.next());
                    System.out.println("Enter New Product ID:");
                    newDto.setProductId(scanner.nextInt());
                    System.out.println("Enter New Product Price:");
                    newDto.setProductPrice(scanner.nextInt());
                    System.out.println("Enter New Product Weight:");
                    newDto.setProductWeight(scanner.nextDouble());
                    System.out.println("Enter New Product Color:");
                    newDto.setProductColor(scanner.next());

                    String update = service.updateById(idToUpdate, newDto);
                    System.out.println(update);
                    break;

                case 4:
                    // Delete operation
                    System.out.println("Enter the Product ID to delete:");
                    int idToDelete = scanner.nextInt();
                    String delete = service.deleteById(idToDelete, new ProductDto());
                    System.out.println(delete);
                    break;



                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\n");
        }
    }
}
