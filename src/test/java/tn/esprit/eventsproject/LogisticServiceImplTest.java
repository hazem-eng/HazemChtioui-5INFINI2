package tn.esprit.eventsproject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.eventsproject.entities.Participant;
import tn.esprit.eventsproject.repositories.ParticipantRepository;
import tn.esprit.eventsproject.services.EventServicesImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class LogisticServiceImplTest {
    @Mock
    private ParticipantRepository participantRepository;

    @InjectMocks
    private EventServicesImpl eventServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddParticipant() {
        // Arrange
        Participant participant = new Participant(/* add participant data */);
        when(participantRepository.save(participant)).thenReturn(participant);

        // Act
        Participant savedParticipant = eventServices.addParticipant(participant);

        // Assert
        assertEquals(participant, savedParticipant);
        verify(participantRepository, times(1)).save(participant);
    }
}
