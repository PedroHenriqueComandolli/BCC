import {
registerRoute,
navigate
}
from "./router.js"

import {
dashboard
}
from "./pages/dashboard.js"

import {
gamesPage
}
from "./pages/games.js"

import {
favoritesPage
}
from "./pages/favorites.js"

registerRoute(
"#/",
dashboard
)

registerRoute(
"#/games",
gamesPage
)

registerRoute(
"#/favorites",
favoritesPage
)

navigate()