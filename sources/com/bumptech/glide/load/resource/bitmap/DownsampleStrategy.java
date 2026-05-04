package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f28807a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f28808b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final DownsampleStrategy f28809c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final DownsampleStrategy f28810d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final DownsampleStrategy f28811e;

    /* renamed from: f, reason: collision with root package name */
    public static final DownsampleStrategy f28812f;

    /* renamed from: g, reason: collision with root package name */
    public static final DownsampleStrategy f28813g;

    /* renamed from: h, reason: collision with root package name */
    public static final ik.d<DownsampleStrategy> f28814h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f28815i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            if (Math.min(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            int ceil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return b(i11, i12, i13, i14) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f28809c.a(i11, i12, i13, i14);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, DownsampleStrategy.f28809c.b(i11, i12, i13, i14));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return DownsampleStrategy.f28815i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            if (DownsampleStrategy.f28815i) {
                return Math.min(i13 / i11, i14 / i12);
            }
            if (Math.max(i12 / i14, i11 / i13) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i11, int i12, int i13, int i14) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        f28811e = dVar;
        f28812f = new f();
        f28813g = dVar;
        f28814h = ik.d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f28815i = true;
    }

    public abstract SampleSizeRounding a(int i11, int i12, int i13, int i14);

    public abstract float b(int i11, int i12, int i13, int i14);
}
