package com.coins;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability createProbability(double probability) throws Exception {
        if (probability < 0 || probability > 1) {
            throw new Exception("invalid favourable outcome");
        }

        return new Probability(probability);
    }

    public Probability complement() {
        double newProbability = 1 - this.probability;
        return new Probability(newProbability);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }


    public Probability and(Probability p2) {
        return new Probability(this.probability * p2.probability);
    }

    public Probability or(Probability p2) {
        Probability add = this.and(p2);
        return new Probability(this.probability + p2.probability - add.probability);
    }
}
