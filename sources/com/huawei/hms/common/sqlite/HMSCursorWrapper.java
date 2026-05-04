package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a, reason: collision with root package name */
    private AbstractWindowedCursor f35599a;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor == null) {
            throw new IllegalArgumentException("cursor cannot be null");
        }
        if (!(cursor instanceof CursorWrapper)) {
            throw new IllegalArgumentException("cursor:" + cursor + " is not a subclass for CursorWrapper");
        }
        Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
        if (wrappedCursor == null) {
            throw new IllegalArgumentException("getWrappedCursor cannot be null");
        }
        if (wrappedCursor instanceof AbstractWindowedCursor) {
            this.f35599a = (AbstractWindowedCursor) wrappedCursor;
            return;
        }
        throw new IllegalArgumentException("getWrappedCursor:" + wrappedCursor + " is not a subclass for CursorWrapper");
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i11, CursorWindow cursorWindow) {
        this.f35599a.fillWindow(i11, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f35599a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f35599a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i11, int i12) {
        return this.f35599a.onMove(i11, i12);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.f35599a.setWindow(cursorWindow);
    }
}
