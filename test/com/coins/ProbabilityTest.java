package com.coins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void CreateProbability() throws Exception {
        Probability probability = Probability.createProbability(.5);
        assertInstanceOf(Probability.class, probability);
    }

    @Test
    void complement() throws Exception {
        Probability probability = Probability.createProbability(0.25);
        Probability complement = probability.complement();
        assertEquals(complement, Probability.createProbability(0.75));
    }

    @Test
    void invalidFavourableOutcome() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> Probability.createProbability(11.9));
    }

    @Test
    void probabilityOfTailOnBothCoin() throws Exception {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);
        Probability newProbability = p1.and(p2);

        assertEquals(newProbability, Probability.createProbability(0.25));
    }

    @Test
    void probabilityOfTailAtLeastOnOneCoin() throws Exception {
        Probability p1 = Probability.createProbability(0.5);
        Probability p2 = Probability.createProbability(0.5);
        Probability newProbability = p1.or(p2);

        assertEquals(newProbability, Probability.createProbability(0.75));
    }
}