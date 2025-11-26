package edu.pitt.se;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void classifyEnergy_High() {
      List<Integer> bpms = Arrays.asList(140, 150, 145);
      assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void classifyEnergy_Medium() {
      List<Integer> bpms = Arrays.asList(100, 110, 120);
      assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void classifyEnergy_Low() {
      List<Integer> bpms = Arrays.asList(60, 70, 80);
      assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void isValidTrackTitle_Valid() {
      assertTrue(PlaylistRecommender.isValidTrackTitle("Hello World"));
      assertTrue(PlaylistRecommender.isValidTrackTitle("A"));
      assertTrue(PlaylistRecommender.isValidTrackTitle("The Sound of Silence"));
    }

    @Test
    public void isValidTrackTitle_InValid() {
      assertFalse(PlaylistRecommender.isValidTrackTitle("Track #1")); // contains '#', digit
      assertFalse(PlaylistRecommender.isValidTrackTitle("Song!"));    // punctuation
      assertFalse(PlaylistRecommender.isValidTrackTitle("No_good")); // underscore
    }

    @Test
    public void normalizeVolume() {
      assertEquals(-30, PlaylistRecommender.normalizeVolume(0));
      assertEquals(60, PlaylistRecommender.normalizeVolume(60));
      assertEquals(150, PlaylistRecommender.normalizeVolume(100));
    }
}
