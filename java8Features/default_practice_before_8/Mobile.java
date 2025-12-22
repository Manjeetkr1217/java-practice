package java8Features.default_practice_before_8;
class Mobile{

    void InsertSim(SIM_3G sim){
        sim.call();
        sim.sms();
        sim.videoCall();
        
        
        //sim iplementation of default method is not possible before java 8
        // sim.data(); // we cannot access default method in interface before java 8
        
    }
}