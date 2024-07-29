/*
 * Copyright (c) 2024, the original author(s).
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * https://opensource.org/licenses/BSD-3-Clause
 */
package org.jline.consoleui.prompt.builder;

public abstract class AbstractBuilder<SELF extends AbstractBuilder<SELF>> {
    protected final PromptBuilder promptBuilder;
    protected String name;
    protected String message;
    protected boolean cancellable;

    AbstractBuilder(PromptBuilder promptBuilder) {
        this.promptBuilder = promptBuilder;
    }

    @SuppressWarnings("unchecked")
    public SELF name(String name) {
        this.name = name;
        if (message == null) {
            message = name;
        }
        return (SELF) this;
    }

    @SuppressWarnings("unchecked")
    public SELF message(String message) {
        this.message = message;
        if (name == null) {
            name = message;
        }
        return (SELF) this;
    }

    @SuppressWarnings("unchecked")
    public SELF cancellable(boolean cancellable) {
        this.cancellable = cancellable;
        return (SELF) this;
    }
}
