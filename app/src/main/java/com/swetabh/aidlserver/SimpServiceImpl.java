package com.swetabh.aidlserver;

import android.os.RemoteException;

import com.swetabh.mylib.ISimp;

public class SimpServiceImpl extends ISimp.Stub {
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }
}
