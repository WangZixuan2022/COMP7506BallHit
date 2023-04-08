package com.example.ballhit;

import android.os.CountDownTimer;

public class CountDownTimerFactory {

    public CountDownTimerFactory() {
    }

    public static CountDownTimerExt getInstance(long targetTimeMilli) {
        return new CountDownTimerExt(targetTimeMilli, 1000);
    }

    public static class CountDownTimerExt extends CountDownTimer {
        public long remainingTime;

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public CountDownTimerExt(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            this.remainingTime = millisInFuture;
        }

        @Override
        public void onTick(long millisUntilFinished) {
            remainingTime = millisUntilFinished;
        }

        @Override
        public void onFinish() {
            remainingTime = 0;
        }
    }
}
