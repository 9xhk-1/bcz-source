package me.jessyan.autosize.unit;

import me.jessyan.autosize.utils.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class UnitsManager {
    private float mDesignHeight;
    private float mDesignWidth;
    private boolean isSupportDP = true;
    private boolean isSupportSP = true;
    private Subunits mSupportSubunits = Subunits.NONE;
    private boolean isSupportScreenSizeDP = false;

    public float getDesignHeight() {
        return this.mDesignHeight;
    }

    public float getDesignWidth() {
        return this.mDesignWidth;
    }

    public Subunits getSupportSubunits() {
        return this.mSupportSubunits;
    }

    public boolean isSupportDP() {
        return this.isSupportDP;
    }

    public boolean isSupportSP() {
        return this.isSupportSP;
    }

    public boolean isSupportScreenSizeDP() {
        return this.isSupportScreenSizeDP;
    }

    public UnitsManager setDesignHeight(float f11) {
        Preconditions.checkArgument(f11 > 0.0f, "designHeight must be > 0");
        this.mDesignHeight = f11;
        return this;
    }

    public UnitsManager setDesignSize(float f11, float f12) {
        setDesignWidth(f11);
        setDesignHeight(f12);
        return this;
    }

    public UnitsManager setDesignWidth(float f11) {
        Preconditions.checkArgument(f11 > 0.0f, "designWidth must be > 0");
        this.mDesignWidth = f11;
        return this;
    }

    public UnitsManager setSupportDP(boolean z11) {
        this.isSupportDP = z11;
        return this;
    }

    public UnitsManager setSupportSP(boolean z11) {
        this.isSupportSP = z11;
        return this;
    }

    public UnitsManager setSupportScreenSizeDP(boolean z11) {
        this.isSupportScreenSizeDP = z11;
        return this;
    }

    public UnitsManager setSupportSubunits(Subunits subunits) {
        this.mSupportSubunits = (Subunits) Preconditions.checkNotNull(subunits, "The supportSubunits can not be null, use Subunits.NONE instead");
        return this;
    }
}
