package com.amongus.core.api.task;

import java.util.UUID;

public interface Task {

    UUID getId();
    String getName();
    boolean isCompleted();

}
