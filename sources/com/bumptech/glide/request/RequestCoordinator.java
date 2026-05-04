package com.bumptech.glide.request;

import bl.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface RequestCoordinator {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z11) {
            this.isComplete = z11;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    void a(d dVar);

    boolean b(d dVar);

    boolean d();

    boolean e(d dVar);

    RequestCoordinator getRoot();

    void h(d dVar);

    boolean i(d dVar);
}
