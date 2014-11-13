package com.sb.elsinore.html;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;

import com.sb.elsinore.LaunchControl;

import static org.rendersnake.HtmlAttributesFactory.*;

public class TopBar implements Renderable {

    @Override
    public void renderOn(HtmlCanvas htmlCanvas) throws IOException {
        htmlCanvas.div(id("topbar"))
            .div(id("breweryTitle").class_("left"))
                .h1(class_("breweryNameHeader").onClick("editBreweryName()"))
                    .div(id("breweryName")).write("Elsinore")._div()
                    .small()
                        .a(href(LaunchControl.RepoURL))
                            .content("StrangeBrew Elsinore")
                    ._small()
                ._h1()
            ._div()
            .div(class_("right"))
                .div(class_("breweryImage"))
                    .img(height("200").width("200").id("brewerylogo").src(" "))
                ._div()
                .input(type("file").id("logo").add("data-url", "uploadImage"))
            ._div()
            .div(class_("center-left"))._div()
            .div(class_("center-right"))._div()
        ._div()
        .div(id("messages").style("display:none"))
            .div(class_("panel panel-warning"))
                .div(id("messages-title").class_("title panel-heading"))._div()
                .div(id("messages-body").class_("panel-body"))._div()
            ._div()
        ._div();
    }

}