package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
      if (bpms == null || bpms.isEmpty()) {
        throw new IllegalArgumentException("bpms must not be null or empty");
      }
      double sum = 0L;
      int count = 0;
      for (Integer b : bpms) {
        sum += b;
        count++;
      }
      double avg = sum / count;
      if (avg >= 140.0) {
        return "HIGH";
      } else if (avg >= 100.0) {
        return "MEDIUM";
      } else {
        return "LOW";
      }
    }

    public static boolean isValidTrackTitle(String title) {
      if(title==null||title.length()<1||title.length()>30) return false;
      for(char c: title.toCharArray()){
        if(Character.isAlphabetic(c)||c==' ') continue;
        else return false;
      }
      return true;
        // TODO: Implement isValidTrackTitle()
//        throw new UnsupportedOperationException("Not implemented");
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
      if(volumeDb<0) return 0;
      else if(volumeDb>100) return 100;
      else return volumeDb;
    }
}
