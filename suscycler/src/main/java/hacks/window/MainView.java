package hacks.window;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.component.button.Button;
import hacks.repository.*;
import hacks.model.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;


@Route("Info")
public class MainView extends VerticalLayout implements HasUrlParameter<String> {
    private String buildingName;

    public MainView() {

        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setWidth("100%");

        // Initialize your UI components here
        addTitle();
        addBuildingInfo();
        H1 ugapoints = new H1("UGA recycled 2000 bottles!");
        H1 flpoints = new H1("UF recycled 1 bottle!");
        H2 winner = new H2("UGA is in the lead!!");
        add(ugapoints, flpoints, winner);
    }

    private void addTitle() {
        Div titleDiv = new Div();
        titleDiv.setText("This Bin's Stats");
        titleDiv.getStyle().set("font-size", "48px");
        titleDiv.getStyle().set("font-weight", "bold");
        add(titleDiv);
    }

    private void addBuildingInfo() {
        int x = 20; // building data
        int y = 15;
        int z = 5;
        Paragraph infoCampus = new Paragraph("UGA Saved " + x + " dolphins!");
        Paragraph infoBuilding = new Paragraph("Driftmier saved " + y + " dolphins!");
        Paragraph infoBin = new Paragraph("This bin saved " + z + " dolphins!");
        infoCampus.getStyle().set("text-align", "center");
        infoCampus.getStyle().set("font-size", "26px");
        infoBuilding.getStyle().set("text-align", "center");
        infoBuilding.getStyle().set("font-size", "24px");
        infoBin.getStyle().set("text-align", "center");
        infoBin.getStyle().set("font-size", "22px");
        add(infoCampus,infoBuilding,infoBin);
    }


    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        if (parameter != null) {
            buildingName = parameter;
        }
    }
}
