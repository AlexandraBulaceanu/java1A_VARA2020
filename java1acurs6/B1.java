public class B1{
    class B2{}
    static class B3{}
    class B4 extends B3{}
    class B5 extends B2{}
    static class B6 extends B3{}
    static class B7 extends B1{}//B1 este si clasa outer si clasa superioara
    //static class B8 extends B2{}
    class B9 extends B1{}//B1 este clasa outer si superioara
    //la mostenire se poate tot, fara clasa inner statica pe clasa inner non-statica
    //pot sa mostenesc si clase din afara lui outer
}