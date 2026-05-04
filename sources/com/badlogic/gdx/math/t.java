package com.badlogic.gdx.math;

import com.badlogic.gdx.math.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface t<T extends t<T>> {
    T add(T t11);

    T clamp(float f11, float f12);

    T cpy();

    float dot(T t11);

    float dst(T t11);

    float dst2(T t11);

    boolean epsilonEquals(T t11, float f11);

    boolean hasOppositeDirection(T t11);

    boolean hasSameDirection(T t11);

    T interpolate(T t11, float f11, l lVar);

    boolean isCollinear(T t11);

    boolean isCollinear(T t11, float f11);

    boolean isCollinearOpposite(T t11);

    boolean isCollinearOpposite(T t11, float f11);

    boolean isOnLine(T t11);

    boolean isOnLine(T t11, float f11);

    boolean isPerpendicular(T t11);

    boolean isPerpendicular(T t11, float f11);

    boolean isUnit();

    boolean isUnit(float f11);

    boolean isZero();

    boolean isZero(float f11);

    float len();

    float len2();

    T lerp(T t11, float f11);

    T limit(float f11);

    T limit2(float f11);

    T mulAdd(T t11, float f11);

    T mulAdd(T t11, T t12);

    T nor();

    T scl(float f11);

    T scl(T t11);

    T set(T t11);

    T setLength(float f11);

    T setLength2(float f11);

    T setToRandomDirection();

    T setZero();

    T sub(T t11);
}
