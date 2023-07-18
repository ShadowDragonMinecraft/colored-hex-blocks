package net.shadowdragon.coloredhexblocks.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.shadowdragon.coloredhexblocks.screen.DyingStationScreenHandler;

public class ValidC2SPacket {
    public static void recive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                              PacketByteBuf buf, PacketSender responseSender){
        //Everything here happens only on the server
        String string = buf.readString();

        if(string.matches("false")){
            DyingStationScreenHandler.validPacket = false;
        } else{
            DyingStationScreenHandler.validPacket = true;
        }

    }
}