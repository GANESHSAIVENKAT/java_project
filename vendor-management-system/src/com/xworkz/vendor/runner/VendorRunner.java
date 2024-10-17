package com.xworkz.vendor.runner;

import com.xworkz.vendor.dto.VendorDto;
import com.xworkz.vendor.repository.VendorRepoImplimentation;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImplimentation;

import lombok.AllArgsConstructor;
import java.util.Scanner;

@AllArgsConstructor
public class VendorRunner {

    public static void main(String[] args) {
        VendorService service = new VendorServiceImplimentation(new VendorRepoImplimentation());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Create Vendor");
            System.out.println("2. Read All Vendors");
            System.out.println("3. Update Vendor");
            System.out.println("4. Delete Vendor");
           

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create operation
                    VendorDto dto = new VendorDto();
                    System.out.println("Enter Vendor Name:");
                    dto.setVendorName(scanner.next());
                    System.out.println("Enter Product Type:");
                    dto.setProducType(scanner.next());
                    System.out.println("Enter Vendor Contact:");
                    dto.setVendorContact(scanner.nextLong());
                    System.out.println("Enter Vendor ID:");
                    dto.setVendorId(scanner.nextInt());
                    System.out.println("Enter Vendor Email:");
                    dto.setVendorEmail(scanner.next());

                    String result = service.validate(dto);
                    System.out.println(result);
                    break;

                case 2:
                    // Read operation
                    System.out.println("List of All Vendors:");
                    System.out.println(service.getAll());
                    break;

                case 3:
                    // Update operation
                    VendorDto newdto = new VendorDto();
                    System.out.println("Enter the Vendor ID to update:");
                    int idToUpdate = scanner.nextInt();

                    System.out.println("Enter New Vendor Name:");
                    newdto.setVendorName(scanner.next());
                    System.out.println("Enter New Product Type:");
                    newdto.setProducType(scanner.next());
                    System.out.println("Enter New Vendor Contact:");
                    newdto.setVendorContact(scanner.nextLong());
                    System.out.println("Enter New Vendor ID:");
                    newdto.setVendorId(scanner.nextInt());
                    System.out.println("Enter New Vendor Email:");
                    newdto.setVendorEmail(scanner.next());

                    String update = service.updateById(idToUpdate, newdto);
                    System.out.println(update);
                    break;

                case 4:
                    // Delete operation
                    System.out.println("Enter the Vendor ID to delete:");
                    int idToDelete = scanner.nextInt();

                    System.out.println("Enter Vendor Name:");
                    dto = new VendorDto();
                    dto.setVendorId(idToDelete);
                    dto.setVendorName(scanner.next());

                    String delete = service.deleteById(idToDelete, dto);
                    System.out.println(delete);
                    break;
                   
             

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}
