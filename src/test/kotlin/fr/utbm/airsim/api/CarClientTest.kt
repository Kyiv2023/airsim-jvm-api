package fr.utbm.airsim.api

import org.msgpack.rpc.Client
import org.msgpack.rpc.loop.EventLoop

/**
 * Test class for the car client
 */
class CarClientTest {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val loop = EventLoop.defaultEventLoop()

            val rpcClient = Client("127.0.0.1", 41451, loop)
            val carClient = rpcClient.proxy(CarClientInterface::class.java)

            println(carClient.getConnectionState())

//            carClient.confirmConnection()
//            carClient.enableApiControl(true)
//
//            val controls = CarControls()
//            controls.throttle = 1f
//            carClient.setCarControls(controls)
        }
    }

}