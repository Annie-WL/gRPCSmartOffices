module com.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.grpc;
    requires io.grpc.stub;
    requires protobuf.java;
    requires java.annotation;
    requires io.grpc.protobuf;
    requires com.google.common;
    requires consul.api;

    opens com.project.Controller to javafx.fxml;
    exports com.project.app;
}
