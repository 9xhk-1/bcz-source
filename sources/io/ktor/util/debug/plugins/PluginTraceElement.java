package io.ktor.util.debug.plugins;

import kotlin.jvm.internal.g0;
import m00.a;
import m00.c;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PluginTraceElement {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f62006a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f62007b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PluginEvent f62008c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PluginEvent {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PluginEvent[] $VALUES;
        public static final PluginEvent STARTED = new PluginEvent("STARTED", 0);
        public static final PluginEvent FINISHED = new PluginEvent("FINISHED", 1);

        private static final /* synthetic */ PluginEvent[] $values() {
            return new PluginEvent[]{STARTED, FINISHED};
        }

        static {
            PluginEvent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private PluginEvent(String str, int i11) {
        }

        @k
        public static a<PluginEvent> getEntries() {
            return $ENTRIES;
        }

        public static PluginEvent valueOf(String str) {
            return (PluginEvent) Enum.valueOf(PluginEvent.class, str);
        }

        public static PluginEvent[] values() {
            return (PluginEvent[]) $VALUES.clone();
        }
    }

    public PluginTraceElement(@k String pluginName, @k String handler, @k PluginEvent event) {
        g0.p(pluginName, "pluginName");
        g0.p(handler, "handler");
        g0.p(event, "event");
        this.f62006a = pluginName;
        this.f62007b = handler;
        this.f62008c = event;
    }

    public static /* synthetic */ PluginTraceElement e(PluginTraceElement pluginTraceElement, String str, String str2, PluginEvent pluginEvent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pluginTraceElement.f62006a;
        }
        if ((i11 & 2) != 0) {
            str2 = pluginTraceElement.f62007b;
        }
        if ((i11 & 4) != 0) {
            pluginEvent = pluginTraceElement.f62008c;
        }
        return pluginTraceElement.d(str, str2, pluginEvent);
    }

    @k
    public final String a() {
        return this.f62006a;
    }

    @k
    public final String b() {
        return this.f62007b;
    }

    @k
    public final PluginEvent c() {
        return this.f62008c;
    }

    @k
    public final PluginTraceElement d(@k String pluginName, @k String handler, @k PluginEvent event) {
        g0.p(pluginName, "pluginName");
        g0.p(handler, "handler");
        g0.p(event, "event");
        return new PluginTraceElement(pluginName, handler, event);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginTraceElement)) {
            return false;
        }
        PluginTraceElement pluginTraceElement = (PluginTraceElement) obj;
        return g0.g(this.f62006a, pluginTraceElement.f62006a) && g0.g(this.f62007b, pluginTraceElement.f62007b) && this.f62008c == pluginTraceElement.f62008c;
    }

    @k
    public final PluginEvent f() {
        return this.f62008c;
    }

    @k
    public final String g() {
        return this.f62007b;
    }

    @k
    public final String h() {
        return this.f62006a;
    }

    public int hashCode() {
        return (((this.f62006a.hashCode() * 31) + this.f62007b.hashCode()) * 31) + this.f62008c.hashCode();
    }

    @k
    public String toString() {
        return "PluginTraceElement(pluginName=" + this.f62006a + ", handler=" + this.f62007b + ", event=" + this.f62008c + ')';
    }
}
