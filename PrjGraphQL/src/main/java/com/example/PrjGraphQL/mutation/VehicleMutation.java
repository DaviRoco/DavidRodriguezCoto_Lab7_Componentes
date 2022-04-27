package com.example.PrjGraphQL.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.PrjGraphQL.entities.Vehicle;
import com.example.PrjGraphQL.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(String type, String modelCode, String brandName,
                                 String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode,
                brandName, launchDate);
    }

}
