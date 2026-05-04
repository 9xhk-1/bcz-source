package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.Compatibility;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ResourcesWrapper extends Resources {
    private final Resources mResources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i11) throws Resources.NotFoundException {
        return this.mResources.getAnimation(i11);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i11) throws Resources.NotFoundException {
        return this.mResources.getBoolean(i11);
    }

    @Override // android.content.res.Resources
    public int getColor(int i11) throws Resources.NotFoundException {
        return this.mResources.getColor(i11);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i11) throws Resources.NotFoundException {
        return this.mResources.getColorStateList(i11);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i11) throws Resources.NotFoundException {
        return this.mResources.getDimension(i11);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i11) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelOffset(i11);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i11) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelSize(i11);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) throws Resources.NotFoundException {
        return this.mResources.getDrawable(i11);
    }

    public final Drawable getDrawableCanonical(int i11) throws Resources.NotFoundException {
        return super.getDrawable(i11);
    }

    @Override // android.content.res.Resources
    @RequiresApi(15)
    public Drawable getDrawableForDensity(int i11, int i12) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i11, i12, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i11, int i12, int i13) {
        return this.mResources.getFraction(i11, i12, i13);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i11) throws Resources.NotFoundException {
        return this.mResources.getIntArray(i11);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i11) throws Resources.NotFoundException {
        return this.mResources.getInteger(i11);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i11) throws Resources.NotFoundException {
        return this.mResources.getLayout(i11);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i11) throws Resources.NotFoundException {
        return this.mResources.getMovie(i11);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i11, int i12, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i11, i12, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i11, int i12) throws Resources.NotFoundException {
        return this.mResources.getQuantityText(i11, i12);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i11) throws Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i11) throws Resources.NotFoundException {
        return this.mResources.getResourceName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i11) throws Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i11);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i11) throws Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i11);
    }

    @Override // android.content.res.Resources
    public String getString(int i11) throws Resources.NotFoundException {
        return this.mResources.getString(i11);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i11) throws Resources.NotFoundException {
        return this.mResources.getStringArray(i11);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i11) throws Resources.NotFoundException {
        return this.mResources.getText(i11);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i11) throws Resources.NotFoundException {
        return this.mResources.getTextArray(i11);
    }

    @Override // android.content.res.Resources
    public void getValue(int i11, TypedValue typedValue, boolean z11) throws Resources.NotFoundException {
        this.mResources.getValue(i11, typedValue, z11);
    }

    @Override // android.content.res.Resources
    @RequiresApi(15)
    public void getValueForDensity(int i11, int i12, TypedValue typedValue, boolean z11) throws Resources.NotFoundException {
        Compatibility.Api15Impl.getValueForDensity(this.mResources, i11, i12, typedValue, z11);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i11) throws Resources.NotFoundException {
        return this.mResources.getXml(i11);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i11) throws Resources.NotFoundException {
        return this.mResources.obtainTypedArray(i11);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i11) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i11);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i11) throws Resources.NotFoundException {
        return this.mResources.openRawResourceFd(i11);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawable(int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawable(this.mResources, i11, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int i11, int i12, Resources.Theme theme) {
        return ResourcesCompat.getDrawableForDensity(this.mResources, i11, i12, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i11, int i12) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i11, i12);
    }

    @Override // android.content.res.Resources
    public String getString(int i11, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getString(i11, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i11, CharSequence charSequence) {
        return this.mResources.getText(i11, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z11) throws Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z11);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i11, TypedValue typedValue) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i11, typedValue);
    }
}
