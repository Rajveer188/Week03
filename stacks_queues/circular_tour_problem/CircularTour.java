package com.tit.week03.day02.stacks_queues.circular_tour_problem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    private int findPoint (int[] petrol, int[] distance){
        int start = 0;
        int currentPetrol = 0;
        int totalShortage = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < petrol.length; i++) {
            currentPetrol += petrol[i] - distance[i];
            queue.add(i);

            while (currentPetrol < 0 && !queue.isEmpty()) {
                totalShortage += currentPetrol;
                start = queue.poll() + 1;
                currentPetrol = 0;
            }
        }

        if (currentPetrol + totalShortage >= 0) {
            return start;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] petrol = {1, 2, 3, 4, 5};
        int[] distance = {3, 4, 5, 1, 2};

        CircularTour circularTour = new CircularTour();
        int point = circularTour.findPoint(petrol, distance);
        System.out.println("starting point - "+point);
    }
}
