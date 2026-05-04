package org.junit.platform.engine;

import ba0.c2;
import ba0.g4;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class UniqueId implements Cloneable, Serializable {
    private static final String ENGINE_SEGMENT_TYPE = "engine";
    private static final long serialVersionUID = 1;
    private transient int hashCode;
    private final List<Segment> segments;
    private transient SoftReference<String> toString;
    private final a uniqueIdFormat;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.0", status = API.Status.STABLE)
    public static class Segment implements Serializable {
        private static final long serialVersionUID = 1;
        private final String type;
        private final String value;

        public Segment(String type, String value) {
            c2.k(type, "type must not be null or blank");
            c2.k(value, "value must not be null or blank");
            this.type = type;
            this.value = value;
        }

        public boolean equals(Object o11) {
            if (this == o11) {
                return true;
            }
            if (o11 != null && getClass() == o11.getClass()) {
                Segment segment = (Segment) o11;
                if (Objects.equals(this.type, segment.type) && Objects.equals(this.value, segment.value)) {
                    return true;
                }
            }
            return false;
        }

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        public String toString() {
            return new g4(this).a("type", this.type).a("value", this.value).toString();
        }
    }

    private UniqueId(a uniqueIdFormat, Segment segment) {
        this(uniqueIdFormat, (List<Segment>) Collections.singletonList(segment));
    }

    public static UniqueId forEngine(String engineId) {
        c2.k(engineId, "engineId must not be null or blank");
        return root(ENGINE_SEGMENT_TYPE, engineId);
    }

    public static UniqueId parse(String uniqueId) throws JUnitException {
        c2.k(uniqueId, "Unique ID string must not be null or blank");
        return a.m().n(uniqueId);
    }

    public static UniqueId root(String segmentType, String value) {
        return new UniqueId(a.m(), new Segment(segmentType, value));
    }

    public final UniqueId append(String segmentType, String value) {
        return append(new Segment(segmentType, value));
    }

    @API(since = "1.10", status = API.Status.STABLE)
    public UniqueId appendEngine(String engineId) {
        return append(new Segment(ENGINE_SEGMENT_TYPE, engineId));
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return this.segments.equals(((UniqueId) o11).segments);
    }

    public final Optional<String> getEngineId() {
        return getRoot().filter(new Predicate() { // from class: ca0.f0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = UniqueId.ENGINE_SEGMENT_TYPE.equals(((UniqueId.Segment) obj).getType());
                return equals;
            }
        }).map(new Function() { // from class: ca0.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((UniqueId.Segment) obj).getValue();
            }
        });
    }

    @API(since = "1.5", status = API.Status.STABLE)
    public Segment getLastSegment() {
        return this.segments.get(r0.size() - 1);
    }

    public final Optional<Segment> getRoot() {
        return this.segments.isEmpty() ? Optional.empty() : Optional.of(this.segments.get(0));
    }

    public final List<Segment> getSegments() {
        return Collections.unmodifiableList(this.segments);
    }

    @API(since = "1.1", status = API.Status.STABLE)
    public boolean hasPrefix(UniqueId potentialPrefix) {
        c2.r(potentialPrefix, "potentialPrefix must not be null");
        int size = this.segments.size();
        int size2 = potentialPrefix.segments.size();
        return size >= size2 && this.segments.subList(0, size2).equals(potentialPrefix.segments);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            i11 = this.segments.hashCode();
            if (i11 == 0) {
                i11 = 1;
            }
            this.hashCode = i11;
        }
        return i11;
    }

    @API(since = "1.5", status = API.Status.STABLE)
    public UniqueId removeLastSegment() {
        c2.e(this.segments.size() > 1, "Cannot remove last remaining segment");
        a aVar = this.uniqueIdFormat;
        List<Segment> list = this.segments;
        return new UniqueId(aVar, new ArrayList(list.subList(0, list.size() - 1)));
    }

    public String toString() {
        SoftReference<String> softReference = this.toString;
        String str = softReference == null ? null : softReference.get();
        if (str != null) {
            return str;
        }
        String l11 = this.uniqueIdFormat.l(this);
        this.toString = new SoftReference<>(l11);
        return l11;
    }

    public UniqueId(a uniqueIdFormat, List<Segment> segments) {
        this.uniqueIdFormat = uniqueIdFormat;
        this.segments = segments;
    }

    @API(since = "1.1", status = API.Status.STABLE)
    public final UniqueId append(Segment segment) {
        c2.r(segment, "segment must not be null");
        ArrayList arrayList = new ArrayList(this.segments.size() + 1);
        arrayList.addAll(this.segments);
        arrayList.add(segment);
        return new UniqueId(this.uniqueIdFormat, arrayList);
    }
}
