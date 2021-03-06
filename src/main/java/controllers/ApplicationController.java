/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.Game;
import models.SpanishGame;
import models.EnglishGame;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUpEnglish() {
        return Results.html().template("views/AcesUp/EnglishAcesUp.flt.html");
    }

    public Result acesUpSpanish() {
        return Results.html().template("views/AcesUp/SpanishAcesUp.flt.html");
    }

    public Result gameGetEnglish(){
        Game g = new EnglishGame();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }

    public Result gameGetSpanish(){
        Game g = new SpanishGame();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }

    public Result gameResetEnglish(){
        Game g = new EnglishGame();
        g.shuffle();
        g.dealFour();
        g.score = 0;

        return Results.json().render(g);
    }

    public Result gameResetSpanish(){
        Game g = new SpanishGame();
        g.shuffle();
        g.dealFour();
        g.score = 0;

        return Results.json().render(g);

    }

    public Result dealPostEnglish(Context context, EnglishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result dealPostSpanish(Context context, SpanishGame g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result removeCardEnglish(Context context, @PathParam("column") int colNumber, EnglishGame g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }

    public Result removeCardSpanish(Context context, @PathParam("column") int colNumber, SpanishGame g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }

    public Result moveCardEnglish(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, EnglishGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }

    public Result moveCardSpanish(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, SpanishGame g){
        g.move(colFrom,colTo);
        return  Results.json().render(g);
    }

}
