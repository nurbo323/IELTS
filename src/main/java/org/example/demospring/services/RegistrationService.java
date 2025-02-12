package org.example.demospring.services;

import lombok.RequiredArgsConstructor;
import org.example.demospring.models.User;
import org.example.demospring.repositories.UserRepository;
import org.example.demospring.services.interfaces.RegistrationServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService implements RegistrationServiceInterface {
    private final UserRepository usersRepo;

    public RegistrationService(UserRepository usersRepo) { // Fixed constructor
        this.usersRepo = usersRepo;
    }

    @Override
    public void register(User user) {
        usersRepo.save(user);
    }
}
