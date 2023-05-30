package Lecture.Queue.PriorityQueue;
import java.util.*;

import java.util.PriorityQueue;

class Athlete implements Comparable<Athlete> {
    int score;
    int placement;

    public Athlete(int score, int placement) {
        this.score = score;
        this.placement = placement;
    }

    @Override
    public int compareTo(Athlete other) {
        return Integer.compare(other.score, this.score); // Sort in descending order of score
    }
}

class PlacementMedals {
    public static String[] findPlacements(int[] scores) {
        int n = scores.length;
        String[] placements = new String[n];

        PriorityQueue<Athlete> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(new Athlete(scores[i], i + 1));
        }

        for (int i = 0; i < n; i++) {
            Athlete athlete = pq.poll();
            if (athlete.placement == 1) {
                placements[i] = "Gold Medal";
            } else if (athlete.placement == 2) {
                placements[i] = "Silver Medal";
            } else if (athlete.placement == 3) {
                placements[i] = "Bronze Medal";
            } else {
                placements[i] = String.valueOf(athlete.placement);
            }
        }

        return placements;
    }

    public static void main(String[] args) {
        int[] scores1 = {5, 4, 3, 2, 1};
        String[] placements1 = findPlacements(scores1);
        System.out.println("Example 1:");
        for (String placement : placements1) {
            System.out.println(placement);
        }

        int[] scores2 = {10, 3, 8, 9, 4};
        String[] placements2 = findPlacements(scores2);
        System.out.println("\nExample 2:");
        for (String placement : placements2) {
            System.out.println(placement);
        }
    }
}

