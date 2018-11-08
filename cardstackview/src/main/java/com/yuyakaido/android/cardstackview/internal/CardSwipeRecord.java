package com.yuyakaido.android.cardstackview.internal;

public class CardSwipeRecord {
    public int index;
    public int dx;
    public int dy;
    public float proportion;

    private CardSwipeRecord(int index, int dx, int dy, float proportion) {
        this.index = index;
        this.dx = dx;
        this.dy = dy;
        this.proportion = proportion;
    }

    public void restore(CardStackState state) {
        state.topPosition = index;
        state.dx = dx;
        state.dy = dy;
        state.proportion = proportion;
    }

    public static CardSwipeRecord save(CardStackState state) {
        return new CardSwipeRecord(
                state.topPosition,
                state.dx,
                state.dy,
                state.proportion
        );
    }

}
