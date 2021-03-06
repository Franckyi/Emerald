package com.github.franckyi.emerald.view.animation;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BasicTimeline extends AbstractTimeline {
    private final Timeline timeline;

    public BasicTimeline(KeyFrame... keyFrames) {
        timeline = new Timeline();
        timeline.getKeyFrames().addAll(keyFrames);
        timeline.setOnFinished(e -> listeners.forEach(Runnable::run));
    }

    @Override
    public void play() {
        timeline.play();
    }

    @Override
    public void stop() {
        timeline.jumpTo(Duration.hours(1));
    }
}
