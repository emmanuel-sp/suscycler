package hacks.window;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.OptionalParameter;
import hacks.repository.*;
import hacks.controller.*;
import hacks.model.*;
import java.util.ArrayList;
import java.util.List;

@Route("")
public class AppLayoutBottomNavbar extends AppLayout implements HasUrlParameter<String> {
    public IntegerField intField;
    public Button button;
    public H3 building;
    public String buildingName;
    public AppLayoutBottomNavbar(BinRepository binRepository) {
        H2 title = new H2("Suscycler");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "var(--lumo-space-m) var(--lumo-space-l)");

        Tabs tabs = getTabs();

        H2 viewTitle = new H2("How many items are you recycling?");

        VerticalLayout content = new VerticalLayout();
        content.add(viewTitle);

        addToNavbar(title);
        addToNavbar(true, tabs);
        intField = new IntegerField();
        intField.setStepButtonsVisible(true);
        intField.setMin(0);
        intField.setMax(8);
        content.add(intField);
        BinController binC = new BinController(binRepository);
        button = new Button("Recycle!", e -> {
            List<Bin> bins0 = binC.getAllItems(); // Bad coding incoming, just cba vvv
            ArrayList<Bin> bins = new ArrayList(bins0);
            buildingName = bins.get(0).getBuilding();
            button.getUI().ifPresent(ui -> ui.navigate("Info/" + buildingName));
        });
        content.add(new HorizontalLayout(button));

        setContent(content);
    }
    // end::snippet[]

    private Tabs getTabs() {
        Tabs tabs = new Tabs();
        tabs.addThemeVariants(TabsVariant.LUMO_MINIMAL,
                TabsVariant.LUMO_EQUAL_WIDTH_TABS);
        return tabs;
    }

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        buildingName = parameter;
        building = new H3(parameter);
        addToNavbar(building);

    }
    //If you need icons
    private Tab createTab(VaadinIcon viewIcon, String viewName) {
        Icon icon = viewIcon.create();
        icon.setSize("var(--lumo-icon-size-s)");
        icon.getStyle().set("margin", "auto");

        RouterLink link = new RouterLink();
        link.add(icon);
        // Demo has no routes
        // link.setRoute(viewClass.java);
        link.setTabIndex(-1);

        Tab tab = new Tab(link);
        tab.setAriaLabel(viewName);
        return tab;
    }

    // tag::snippet[]
}
// end::snippet[]
