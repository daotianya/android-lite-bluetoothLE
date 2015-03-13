package com.litesuits.bluetooth.conn;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

public abstract class ConnectListener extends BluetoothHelper {
    private ConnectState connectState = ConnectState.Initialed;

    public ConnectState getConnectState() {
        return connectState;
    }

    public void setConnectState(ConnectState connectState) {
        this.connectState = connectState;
    }


    public void stateChanged(ConnectState state) {
        onStateChanged(state);
    }

    public abstract void onStateChanged(ConnectState state);

    public abstract void onFailed(ConnectError error);

    public abstract void onServicesDiscovered(BluetoothGatt gatt);

    public abstract void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);

    public abstract void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic);
}